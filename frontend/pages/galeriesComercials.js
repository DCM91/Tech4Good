import { Barris } from '@/components/Barris'
import { Layout } from '@/components/Layout'
import React from 'react'

export default function galeriesComercials() {
  return (
    <Layout title="Tech4good - Galeries Comercials">
       <div className='text-2xl'>Galeries Comercials</div>
       <div className='flex w-100 py-5 px-10'>
          <Barris />
        </div>
    </Layout>

  )
}

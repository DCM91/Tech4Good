import { Barris } from '@/components/Barris'
import { Layout } from '@/components/Layout'
import React from 'react'

export default function gransEstabliments() {
  return (
    <Layout title="Tech4good - Grans Establiments">
     <div className='text-2xl'>Grans Establiments</div>
     <div className='flex w-100 py-5 px-10'>
          <Barris />
      </div>
    </Layout>

  )
}
